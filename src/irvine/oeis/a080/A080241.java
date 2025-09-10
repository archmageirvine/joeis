package irvine.oeis.a080;

/**
 * A080241 Define two sequences by A_n = mex{A_i,B_i : 0 &lt;= i &lt; n} for n &gt;= 0, B_0=0, B_1=1 and for n &gt;= 2, B_n = 2B_{n-1}+(-1)^{A_n}. Sequence gives B_n.
 * @author Sean A. Irvine
 */
public class A080241 extends A080240 {

  @Override
  protected int select(final int a, final int b) {
    return b;
  }
}

