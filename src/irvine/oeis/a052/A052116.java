package irvine.oeis.a052;

/**
 * A052116 Number of nonnegative integer pairs (i,j) with binomial(i+r,r) + binomial(j+r,r) &lt;= binomial(n+r,r), r=3.
 * @author Sean A. Irvine
 */
public class A052116 extends A052115 {

  @Override
  protected long add() {
    return 3;
  }
}
