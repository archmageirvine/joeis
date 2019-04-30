package irvine.oeis.a004;

/**
 * A004702 Expansion of e.g.f. <code>1/(5 - exp(x) - exp(2*x) - exp(3*x) - exp(4*x))</code>.
 * @author Sean A. Irvine
 */
public class A004702 extends A004701 {

  @Override
  protected int terms() {
    return 5;
  }
}

