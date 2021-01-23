package irvine.oeis.a004;

/**
 * A004705 Expansion of e.g.f. 1/(8 - Sum_{k=1..7} exp(k*x)).
 * @author Sean A. Irvine
 */
public class A004705 extends A004701 {

  @Override
  protected int terms() {
    return 8;
  }
}

