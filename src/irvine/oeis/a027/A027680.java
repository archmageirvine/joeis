package irvine.oeis.a027;

/**
 * A027680 Number of independent subsets of 5^n cube (P_5 X ... X P_5).
 * @author Sean A. Irvine
 */
public class A027680 extends A027667 {

  @Override
  protected int pathLength() {
    return 5;
  }
}
