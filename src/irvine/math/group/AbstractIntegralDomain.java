package irvine.math.group;

/**
 * Default implementation of certain ring methods.
 * @author Sean A. Irvine
 * @param <E> underlying element type
 */
public abstract class AbstractIntegralDomain<E> extends AbstractRing<E> {

  @Override
  public boolean isCommutative() {
    return true;
  }

  @Override
  public boolean isIntegralDomain() {
    return true;
  }
}
