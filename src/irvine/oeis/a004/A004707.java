package irvine.oeis.a004;

/**
 * A004707 Expansion of 1/(10 - Sum_{k=1..9} exp(k*x)).
 * @author Sean A. Irvine
 */
public class A004707 extends A004701 {

  @Override
  protected int terms() {
    return 10;
  }
}

