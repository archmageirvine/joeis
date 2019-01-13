package irvine.math.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import irvine.math.api.Function;
import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * The set of functions over another set.
 * @author Sean A. Irvine
 * @param <D> domain
 * @param <R> range
 */
public class FunctionSet<D, R> extends AbstractSet<Function<D, R>> {

  private final Set<D> mDomain;
  private final Set<R> mCodomain;

  /**
   * Construct a new function set.
   * @param domain the domain of the functions
   * @param codomain the range of the functions
   */
  public FunctionSet(final Set<D> domain, final Set<R> codomain) {
    if (domain == null || codomain == null) {
      throw new IllegalArgumentException();
    }
    mDomain = domain;
    mCodomain = codomain;
  }

  @Override
  public Z size() {
    return FunctionUtils.numberFunctions(mDomain, mCodomain);
  }

  @Override
  public boolean contains(final Function<D, R> element) {
    return element != null;
  }

  private static final class FiniteFunctionIterator<D, R> extends AbstractIterator<Function<D, R>> {

    private final Set<D> mDomainSet;
    private final Set<R> mCodomainSet;
    private final List<D> mDomain;
    private final List<R> mCodomain;
    private final int[] mMap;
    private final int mBump;

    @SuppressWarnings("unchecked")
    private List<R> forceSetCodomain(final List<?> set) {
      return (List<R>) set;
    }

    private FiniteFunctionIterator(final Set<D> domain, final Set<R> codomain) {
      mDomainSet = domain;
      mCodomainSet = codomain;
      final Z ds = domain.size();
      final Z cs = codomain.size();
      if (ds == null || cs == null) {
        throw new UnsupportedOperationException();
      }
      mDomain = domain.asList();
      mBump = cs.intValue();
      if (codomain == domain) {
        // Save space and time when the domain and codomain are the same
        // Cast is safe because of == test above
        mCodomain = forceSetCodomain(mDomain);
      } else {
        mCodomain = codomain.asList();
      }
      mMap = new int[mDomain.size()];
    }

    @Override
    public boolean hasNext() {
      return mMap.length > 0 && mMap[0] < mBump;
    }

    @Override
    public Function<D, R> next() {
      // Construct current mapping
      final HashMap<D, R> map = new HashMap<>();
      for (int k = 0; k < mMap.length; ++k) {
        map.put(mDomain.get(k), mCodomain.get(mMap[k]));
      }
      // Bump counts to next mapping
      for (int k = mMap.length - 1; k >= 0; --k) {
        if (++mMap[k] < mBump || k == 0) {
          break;
        }
        mMap[k] = 0;
      }
      return new FiniteFunction<>(mDomainSet, mCodomainSet, map);
    }
  }

  @Override
  public Iterator<Function<D, R>> iterator() {
    return new FiniteFunctionIterator<>(mDomain, mCodomain);
  }

  @Override
  public String toString() {
    return "M(" + mDomain + "\\rightarrow " + mCodomain + ")";
  }
}
