package irvine.oeis.a033;

/**
 * A033095 Number of <code>1</code>'s when n is written in base b for <code>2&lt;=b&lt;=n+1</code>.
 * @author Sean A. Irvine
 */
public class A033095 extends A033093 {

  @Override
  protected long digit() {
    return 1;
  }
}
