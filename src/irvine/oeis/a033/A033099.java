package irvine.oeis.a033;

/**
 * A033099 Number of <code>3</code>'s when n is written in base b for <code>2&lt;=b&lt;=n+1</code>.
 * @author Sean A. Irvine
 */
public class A033099 extends A033093 {

  @Override
  protected long digit() {
    return 3;
  }
}
