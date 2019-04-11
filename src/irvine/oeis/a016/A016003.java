package irvine.oeis.a016;

/**
 * A016003 <code>a(n) =</code> (tau(n^8)+7)/8.
 * @author Sean A. Irvine
 */
public class A016003 extends A016006 {

  @Override
  protected int power() {
    return 8;
  }
}
