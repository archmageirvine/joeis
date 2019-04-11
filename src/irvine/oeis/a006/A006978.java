package irvine.oeis.a006;

/**
 * A006978 Cellular automaton with <code>000, 001, 010, 011, </code>..., <code>111 -&gt; 0,1,1,1,0,1,1,0</code>.
 * @author Sean A. Irvine
 */
public class A006978 extends A006977 {

  private static final boolean[] A = {false, true, true, true, false, true, true, false};

  @Override
  protected boolean isSet(final int v) {
    return A[v];
  }
}
