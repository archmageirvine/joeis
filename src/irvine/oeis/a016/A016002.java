package irvine.oeis.a016;

/**
 * A016002 <code>a(n) =</code> (tau(n^7)+6)/7.
 * @author Sean A. Irvine
 */
public class A016002 extends A016006 {

  @Override
  protected int power() {
    return 7;
  }
}
