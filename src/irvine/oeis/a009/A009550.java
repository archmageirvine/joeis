package irvine.oeis.a009;

/**
 * A009550 "Pascal sweep" for k=10: draw a horizontal line through the 1 at C(k,0) in Pascal's triangle; rotate this line and record the sum of the numbers on it (excluding the initial <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A009550 extends A009475 {

  @Override
  protected long row() {
    return 10;
  }
}
