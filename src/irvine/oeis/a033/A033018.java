package irvine.oeis.a033;

/**
 * A033018 Numbers n such that every run of digits of n in base 5 has length &gt;=2.
 * @author Sean A. Irvine
 */
public class A033018 extends A033015 {

  @Override
  protected int base() {
    return 5;
  }
}
