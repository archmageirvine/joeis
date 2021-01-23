package irvine.oeis.a029;

/**
 * A029844 Expansion of Product_{m&gt;=1} ((1+q^(2*m-1))/(1+q^(2*m)))^7.
 * @author Sean A. Irvine
 */
public class A029844 extends A029840 {

  @Override
  protected int power() {
    return 7;
  }
}
