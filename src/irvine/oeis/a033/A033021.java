package irvine.oeis.a033;

/**
 * A033021 Numbers whose base-8 expansion has no run of digits with length &lt; 2.
 * @author Sean A. Irvine
 */
public class A033021 extends A033015 {

  @Override
  protected int base() {
    return 8;
  }
}
