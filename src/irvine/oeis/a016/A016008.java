package irvine.oeis.a016;

/**
 * A016008 a(n) = (tau(n^12)+11)/12.
 * @author Sean A. Irvine
 */
public class A016008 extends A016006 {

  @Override
  protected int power() {
    return 12;
  }
}
