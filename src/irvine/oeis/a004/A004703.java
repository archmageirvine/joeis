package irvine.oeis.a004;

/**
 * A004703 Expansion of e.g.f. <code>1/(6-exp(x)-exp(2*x)-exp(3*x)-exp(4*x)-exp(5*x))</code>.
 * @author Sean A. Irvine
 */
public class A004703 extends A004701 {

  @Override
  protected int terms() {
    return 6;
  }
}

