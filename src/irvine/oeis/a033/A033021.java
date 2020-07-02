package irvine.oeis.a033;

/**
 * A033021 n-th number k such that every run of digits of k in base 8 has length <code>&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A033021 extends A033015 {

  @Override
  protected int base() {
    return 8;
  }
}
