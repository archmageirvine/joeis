package irvine.oeis.a033;

/**
 * A033023 Numbers k such that every run of digits of k in base 10 has length &gt;=2.
 * @author Sean A. Irvine
 */
public class A033023 extends A033015 {

  @Override
  protected int base() {
    return 10;
  }
}
