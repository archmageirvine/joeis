package irvine.oeis.a016;

/**
 * A016001 <code>a(n) =</code> (tau(n^6)+5)/6.
 * @author Sean A. Irvine
 */
public class A016001 extends A016006 {

  @Override
  protected int power() {
    return 6;
  }
}
