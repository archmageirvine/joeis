package irvine.oeis.a031;

/**
 * A031168 <code>a(n) = prime(n+6) - prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A031168 extends A031169 {

  @Override
  protected int shift() {
    return 6;
  }
}
