package irvine.oeis.a016;

/**
 * A016005 <code>a(n) =</code> (tau(n^9)+8)/9.
 * @author Sean A. Irvine
 */
public class A016005 extends A016006 {

  @Override
  protected int power() {
    return 9;
  }
}
