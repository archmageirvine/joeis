package irvine.oeis.a016;

/**
 * A016009 a(n) = (tau(n^13)+12)/13.
 * @author Sean A. Irvine
 */
public class A016009 extends A016006 {

  @Override
  protected int power() {
    return 13;
  }
}
