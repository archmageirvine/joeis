package irvine.math.set;

import java.util.HashMap;
import java.util.Map;

import irvine.math.api.Function;
import irvine.math.api.Set;
import irvine.math.z.Z;

/**
 * A function that is the inverse of another function.
 *
 * @author Sean A. Irvine
 * @param <D> domain element type
 * @param <R> codomain element type
 */
public final class Inverse<D, R> extends AbstractFunction<D, R> {

  /**
   * Inverse of the supplied function.
   * @param f first function
   * @param <D> domain element type
   * @param <R> codomain element type
   * @return the inverse function
   * @throws ArithmeticException if the supplied function is not invertible.
   */
  public static <D, R> Function<R, D> inverse(final Function<D, R> f) {
    return new Inverse<>(f);
  }

  private final Function<R, D> mF;
  private final Map<D, R> mMap;

  private Inverse(final Function<R, D> f) {
    super(f.codomain(), f.domain());
    if (!f.isOnto() || !f.isOneToOne()) {
      throw new ArithmeticException();
    }
    mF = f;
    final Z size = f.codomain().size();
    if (size != null && size.bitLength() < 32) {
      // Precompute inverse for "small" finite cases
      final Set<R> domain = f.domain();
      mMap = new HashMap<>(domain.size().intValueExact());
      for (final R r : domain) {
        mMap.put(f.image(r), r);
      }
    } else {
      mMap = null;
    }
  }

  @Override
  public R image(final D x) {
    if (mMap != null) {
      return mMap.get(x);
    }
    // We didn't precompute, start a potentially very long search
    for (final R r : mF.domain()) {
      if (mF.image(r).equals(x)) {
        return r;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Set<R> image() {
    return codomain();
  }

  @Override
  public boolean isOnto() {
    return true;
  }

  @Override
  public boolean isOneToOne() {
    return true;
  }

}
