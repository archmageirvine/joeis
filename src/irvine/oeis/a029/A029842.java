package irvine.oeis.a029;

/**
 * A029842 Expansion of Product_{m&gt;=1} ((1+q^(2*m-1))/(1+q^(2*m)))^5.
 * @author Sean A. Irvine
 */
public class A029842 extends A029840 {

  @Override
  protected int power() {
    return 5;
  }
}
