package irvine.oeis.a033;

/**
 * A033026 n-th number k such that every run of digits of k in base 13 has length &gt;=2.
 * @author Sean A. Irvine
 */
public class A033026 extends A033015 {

  @Override
  protected int base() {
    return 13;
  }
}
