package irvine.oeis.a032;

/**
 * A032865 Numbers whose <code>base-10</code> representation <code>Sum_{i=0..m} d(i)*10^i</code> has <code>d(m) &gt; d(m-1) &lt; d(m-2) &gt; ..</code>.
 * @author Sean A. Irvine
 */
public class A032865 extends A032848 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
