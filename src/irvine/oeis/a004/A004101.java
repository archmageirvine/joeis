package irvine.oeis.a004;

import irvine.oeis.a046.A046951;
import irvine.oeis.transform.EulerTransform;

/**
 * A004101 Number of partitions of n of the form a_1*b_1^2 + a_2*b_2^2 + ...; number of semisimple rings with p^n elements for any prime p.
 * @author Sean A. Irvine
 */
public class A004101 extends EulerTransform {

  /** Construct the sequence. */
  public A004101() {
    super(0, new A046951(), 1);
  }
}

