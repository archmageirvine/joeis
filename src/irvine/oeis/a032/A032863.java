package irvine.oeis.a032;

/**
 * A032863 Numbers whose <code>base-8</code> representation <code>Sum_{i=0..m} d(i)*8^i</code> has <code>d(m) &gt; d(m-1) &lt; d(m-2) &gt; ..</code>.
 * @author Sean A. Irvine
 */
public class A032863 extends A032846 {

  @Override
  protected long start() {
    return 0;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
