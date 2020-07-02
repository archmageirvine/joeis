package irvine.oeis.a033;

/**
 * A033028 n-th number k such that every run of digits of k in base 15 has length <code>&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A033028 extends A033015 {

  @Override
  protected int base() {
    return 15;
  }
}
