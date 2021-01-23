package irvine.oeis.a033;

/**
 * A033082 Numbers n with property that all pairs of consecutive base 4 digits differ by 2.
 * @author Sean A. Irvine
 */
public class A033082 extends A033068 {

  @Override
  protected int base() {
    return 4;
  }

  @Override
  protected long diff() {
    return 2;
  }
}
