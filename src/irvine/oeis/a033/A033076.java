package irvine.oeis.a033;

/**
 * A033076 Numbers n with property that all pairs of consecutive base 5 digits differ by 3.
 * @author Sean A. Irvine
 */
public class A033076 extends A033068 {

  @Override
  protected int base() {
    return 5;
  }

  @Override
  protected long diff() {
    return 3;
  }
}
