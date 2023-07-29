package irvine.oeis.a033;

/**
 * A033079 Numbers in which all pairs of consecutive base-8 digits differ by 3.
 * @author Sean A. Irvine
 */
public class A033079 extends A033076 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected int base() {
    return 8;
  }
}
