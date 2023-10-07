package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A006156 Number of ternary squarefree words of length n.
 * @author Sean A. Irvine
 */
public class A006156 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006156(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006156() {
    super(0);
  }

  protected HashSet<String> mWords = new HashSet<>();

  protected char maxLetter() {
    return 'c';
  }

  @Override
  public Z next() {
    if (mWords.isEmpty()) {
      mWords.add("");
    } else {
      final HashSet<String> next = new HashSet<>();
      for (final String w : mWords) {
        for (char letter = 'a'; letter <= maxLetter(); ++letter) {
          final String a = letter + w;
          if (StringUtils.isSquareFreeWord(a)) {
            next.add(a);
          }
        }
      }
      mWords = next;
    }
    return Z.valueOf(mWords.size());
  }
}

