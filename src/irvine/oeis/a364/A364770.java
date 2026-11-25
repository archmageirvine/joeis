package irvine.oeis.a364;

import irvine.math.group.Gl4ResidueClasses;
import irvine.oeis.LambdaSequence;

/**
 * A364770 Number of conjugacy classes in GL(4,Z_n).
 * @author Gregory Morse
 */
public class A364770 extends LambdaSequence {

  /** Construct the sequence. */
  public A364770() {
    super(1, Gl4ResidueClasses::count);
  }
}
