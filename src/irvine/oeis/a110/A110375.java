package irvine.oeis.a110;

import irvine.oeis.NoncomputableSequence;

/**
 * A110375 Numbers n such that Maple 9.5, Maple 10, Maple 11 and Maple 12 give the wrong answers for the number of partitions of n.
 * @author Georg Fischer
 */
public class A110375 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A110375() {
    super(1, NONCOMPUTABLE, 11269, 11566, 12376, 12430, 12700, 12754, 15013, 17589, 17797, 18181,
      18421, 18453, 18549, 18597, 18885, 18949, 18997, 20865, 21531, 21721,
      21963, 22683, 23421, 23457, 23547, 23691, 23729, 23853, 24015, 24087,
      24231, 24339, 24519, 24591, 24627, 24681, 24825, 24933, 25005, 25023,
      25059, 25185, 25293, 27020);
  }
}
