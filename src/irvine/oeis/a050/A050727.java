package irvine.oeis.a050;

/**
 * A050727 Numbers k such that the decimal expansion of 6^k contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050727 extends A050724 {

  @Override
  protected long multiplier() {
    return 6;
  }
}

