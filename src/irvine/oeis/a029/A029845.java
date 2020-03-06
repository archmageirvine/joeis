package irvine.oeis.a029;

/**
 * A029845 Expansion of <code>16/lambda(z)</code> in powers of nome q <code>= exp(Pi*i*z)</code>.
 * @author Sean A. Irvine
 */
public class A029845 extends A029840 {

  @Override
  protected int power() {
    return 8;
  }
}
