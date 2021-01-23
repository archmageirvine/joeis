package irvine.oeis.a027;

/**
 * A027448 Triangle read by rows: 4th power of the lower triangular mean matrix (M[i,j] = 1/i for i &lt;= j).
 * @author Sean A. Irvine
 */
public class A027448 extends A027446 {

  @Override
  protected int power() {
    return 4;
  }
}
