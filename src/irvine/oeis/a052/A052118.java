package irvine.oeis.a052;

/**
 * A052118 Number of nonnegative integer pairs (i,j) with binomial(i+r,r) + binomial(j+r,r) &lt;= binomial(n+r,r), r=5.
 * @author Sean A. Irvine
 */
public class A052118 extends A052115 {

  @Override
  protected long add() {
    return 5;
  }
}
