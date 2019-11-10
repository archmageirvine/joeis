package irvine.oeis.a027;

/**
 * A027448 Triangle read by rows: 4th power of the lower triangular mean matrix <code>(M[i,j] = 1/i</code> for i <code>&lt;= j)</code>.
 * @author Sean A. Irvine
 */
public class A027448 extends A027446 {

  @Override
  protected int power() {
    return 4;
  }
}
