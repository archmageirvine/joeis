package irvine.oeis.a002;

/**
 * A002308 Consecutive quadratic nonresidues <code>mod</code> p.
 * @author Sean A. Irvine
 */
public class A002308 extends A002307 {

  @Override
  protected int residueType() {
    return -1;
  }
}
