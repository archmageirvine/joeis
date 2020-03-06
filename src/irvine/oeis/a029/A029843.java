package irvine.oeis.a029;

/**
 * A029843 Expansion of <code>Product_{m&gt;=1} ((1+q^(2*m-1))/(1+q^(2*m)))^6</code>.
 * @author Sean A. Irvine
 */
public class A029843 extends A029840 {

  @Override
  protected int power() {
    return 6;
  }
}
