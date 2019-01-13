package irvine.math.set;

import irvine.math.api.Set;

/**
 * The identity function on a set.
 *
 * @author Sean A. Irvine
 * @param <D> element type
 */
public class IdentityFunction<D> extends AbstractFunction<D, D> {

  /**
   * Identity function
   * @param set set the function is over
   */
  public IdentityFunction(final Set<D> set) {
    super(set, set);
  }

  @Override
  public D image(final D x) {
    return x;
  }

  @Override
  public Set<D> image() {
    return domain();
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
