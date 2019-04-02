package irvine.oeis.a006;

/**
 * A006978 Cellular automaton with 000, 001, 010, 011, ..., 111 -&gt; 0,1,1,1,0,1,1,0.
 * @author Sean A. Irvine
 */
public class A006978 extends A006977 {

  private static final boolean[] A = {false, true, true, true, false, true, true, false};

  @Override
  protected boolean isSet(final int v) {
    return A[v];
  }
}
