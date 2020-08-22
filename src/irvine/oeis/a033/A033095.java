package irvine.oeis.a033;

/**
 * A033095 Number of 1's when n is written in base b for 2&lt;=b&lt;=n+1.
 * @author Sean A. Irvine
 */
public class A033095 extends A033093 {

  @Override
  protected long digit() {
    return 1;
  }
}
