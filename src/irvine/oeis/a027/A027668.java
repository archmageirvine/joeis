package irvine.oeis.a027;

/**
 * A027668 Number of independent subsets of nodes of 4^n cube (P_4 X ... X P_4).
 * @author Sean A. Irvine
 */
public class A027668 extends A027667 {

  @Override
  protected int pathLength() {
    return 4;
  }
}
