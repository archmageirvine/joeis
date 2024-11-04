package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A072887 The s-inners or non-s-aints, numbers generated like the Aronson series from the letters, specifically the s, in a generating sentence, "S ain't the second, third, fourth, fifth . . . letter of this sentence.".
 * @author Sean A. Irvine
 */
public class A072887 extends ComplementSequence {

  /** Construct the sequence. */
  public A072887() {
    super(1, new A072886(), Z.ONE);
  }
}

