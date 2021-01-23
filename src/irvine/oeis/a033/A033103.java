package irvine.oeis.a033;

/**
 * A033103 Number of 5's when n is written in base b for 2&lt;=b&lt;=n+1.
 * @author Sean A. Irvine
 */
public class A033103 extends A033093 {

  @Override
  protected long digit() {
    return 5;
  }
}
