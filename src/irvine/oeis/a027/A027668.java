package irvine.oeis.a027;

/**
 * A027668 Number of independent subsets of nodes of <code>4^n</code> cube <code>(P_4</code> X ... X <code>P_4)</code>.
 * @author Sean A. Irvine
 */
public class A027668 extends A027667 {

  @Override
  protected int pathLength() {
    return 4;
  }
}
