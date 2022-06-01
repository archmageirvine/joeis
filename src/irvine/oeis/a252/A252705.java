package irvine.oeis.a252;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A252705 The number of ways to color the faces of a regular dodecahedron with n colors, counting mirror images as one.
 * @author Sean A. Irvine
 */
public class A252705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252705() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 82, 5379, 148648, 2085655, 18356514, 116081245, 574795936, 2359033605L, 8345970370L, 26180606287L, 74354990568L, 194253329803L});
  }
}
