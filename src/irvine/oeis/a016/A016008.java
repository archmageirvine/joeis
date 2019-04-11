package irvine.oeis.a016;

/**
 * A016008 <code>a(n) =</code> (tau(n^12)+11)/12.
 * @author Sean A. Irvine
 */
public class A016008 extends A016006 {

  @Override
  protected int power() {
    return 12;
  }
}
