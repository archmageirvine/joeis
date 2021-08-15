package irvine.oeis.a033;

/**
 * A033025 Numbers whose base-12 expansion has no run of digits with length &lt; 2.
 * @author Sean A. Irvine
 */
public class A033025 extends A033015 {

  @Override
  protected int base() {
    return 12;
  }
}
