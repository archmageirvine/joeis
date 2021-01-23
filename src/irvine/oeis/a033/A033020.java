package irvine.oeis.a033;

/**
 * A033020 n-th number k such that every run of digits of k in base 7 has length &gt;=2.
 * @author Sean A. Irvine
 */
public class A033020 extends A033015 {

  @Override
  protected int base() {
    return 7;
  }
}
